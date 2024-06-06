module plus_three_gate (In, dO, ifO, cO);
    
input   [2:0]In;
output  [2:0]dO, ifO, cO;
reg     [2:0]dO, ifO, cO;

assign dO = In+3;

always @(In) 
begin
    if  (In==3'b000)
        begin
            ifO[2] = 1'b0;
            ifO[1] = 1'b1;
            ifO[0] = 1'b1;
        end
    else if(In==3'b001)
        begin
            ifO[2] = 1'b1;
            ifO[1] = 1'b0;
            ifO[0] = 1'b0;
        end
    else if(In==3'b010)
        begin
            ifO[2] = 1'b1;
            ifO[1] = 1'b0;
            ifO[0] = 1'b1;
        end
    else if(In==3'b011)
        begin
            ifO[2] = 1'b1;
            ifO[1] = 1'b1;
            ifO[0] = 1'b0;
        end
    else if(In==3'b100)
        begin
            ifO[2] = 1'b1;
            ifO[1] = 1'b1;
            ifO[0] = 1'b1;
        end
    else if(In==3'b101)
        begin
            ifO[2] = 1'b0;
            ifO[1] = 1'b0;
            ifO[0] = 1'b0;
        end
    else if(In==3'b110)
        begin
            ifO[2] = 1'b0;
            ifO[1] = 1'b0;
            ifO[0] = 1'b1;
        end
    else if(In==3'b111)
        begin
            ifO[2] = 1'b0;
            ifO[1] = 1'b1;
            ifO[0] = 1'b0;
        end        
end

always @(In) 
begin
    case(In)
        3'b000:  cO[2] = 1'b0;
        3'b001:  cO[2] = 1'b1;
        3'b010:  cO[2] = 1'b1;
        3'b011:  cO[2] = 1'b1;
        3'b100:  cO[2] = 1'b1;
        3'b101:  cO[2] = 1'b0;
        3'b110:  cO[2] = 1'b0;
        3'b111:  cO[2] = 1'b0;
    endcase

    case(In)
        3'b000:  cO[1] = 1'b1;
        3'b001:  cO[1] = 1'b0;
        3'b010:  cO[1] = 1'b0;
        3'b011:  cO[1] = 1'b1;
        3'b100:  cO[1] = 1'b1;
        3'b101:  cO[1] = 1'b0;
        3'b110:  cO[1] = 1'b0;
        3'b111:  cO[1] = 1'b1;
    endcase

    case(In)
        3'b000:  cO[0] = 1'b1;
        3'b001:  cO[0] = 1'b0;
        3'b010:  cO[0] = 1'b1;
        3'b011:  cO[0] = 1'b0;
        3'b100:  cO[0] = 1'b1;
        3'b101:  cO[0] = 1'b0;
        3'b110:  cO[0] = 1'b1;
        3'b111:  cO[0] = 1'b0;
    endcase
end
endmodule