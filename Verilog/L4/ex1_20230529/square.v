module square_gate (In, gO, dO, ifO, cO);
    
input   [1:0]In;
output  [3:0]gO, dO, ifO, cO;
reg     [3:0]gO, dO, ifO, cO;
wire    nI0;

not(nI0,In[0]);
and(gO[3],In[1],In[0]);
and(gO[2],In[1],nI0);
buf(gO[1],0);
buf(gO[0],In[0]);


assign dO[3] = In[1] & In[0];
assign dO[2] = In[1] & nI0;
assign dO[1] = 0;
assign dO[0] = In[0];

always @(In) 
begin
    if  (In==2'b00)
        begin
            ifO[3] = 1'b0;
            ifO[2] = 1'b0;
            ifO[1] = 1'b0;
            ifO[0] = 1'b0;
        end
    else if(In==2'b01)
        begin
            ifO[3] = 1'b0;
            ifO[2] = 1'b0;
            ifO[1] = 1'b0;
            ifO[0] = 1'b1;
        end
    else if(In==2'b10)
        begin
            ifO[3] = 1'b0;
            ifO[2] = 1'b1;
            ifO[1] = 1'b0;
            ifO[0] = 1'b0;
        end
    else if(In==2'b11)
        begin
            ifO[3] = 1'b1;
            ifO[2] = 1'b0;
            ifO[1] = 1'b0;
            ifO[0] = 1'b1;
        end
end

always @(In) 
begin
    case(In)
        2'b00:  cO[3] = 1'b0;
        2'b01:  cO[3] = 1'b0;
        2'b10:  cO[3] = 1'b0;
        2'b11:  cO[3] = 1'b1;
    endcase

    case (In)
        2'b00:  cO[2] = 1'b0;
        2'b01:  cO[2] = 1'b0;
        2'b10:  cO[2] = 1'b1;
        2'b11:  cO[2] = 1'b0;
    endcase

    case(In)
        2'b00:  cO[1] = 1'b0;
        2'b01:  cO[1] = 1'b0;
        2'b10:  cO[1] = 1'b0;
        2'b11:  cO[1] = 1'b0;
    endcase

    case(In)
        2'b00:  cO[0] = 1'b0;
        2'b01:  cO[0] = 1'b1;
        2'b10:  cO[0] = 1'b0;
        2'b11:  cO[0] = 1'b1;
    endcase
end

endmodule