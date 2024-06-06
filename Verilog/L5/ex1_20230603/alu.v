module Al_unit (S, A, B, Alu);

input   [3:0]S;
input   [4:0]A, B;
output  [4:0]Alu;
reg     [4:0]Alu;

always @(A or B or S) 
begin
  	if (S == 4'b1101)
        begin
            assign Alu = ~(A&B);
        end
    else if(S == 4'b1100)
        begin
            assign Alu = A ~^ B;
        end
    else if(S == 4'b0111)
        begin
            assign Alu = A >> 2;
        end
    else if(S == 4'b0101)
        begin
            assign Alu = {B[3:0], B[4]};
        end
    else if(S == 4'b0001)
        begin
            assign Alu = (A>B)? A:B;
        end
    else if(S == 4'b0000)
        begin
            assign Alu = (A>B)? 5'b11111:0;
        end     
    else
        begin
            assign Alu = 6;
        end
end
    
endmodule