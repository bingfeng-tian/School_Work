module Al_unit (A, B, S, Alu);

input   [4:0]A, B;
input   [3:0]S;
output  [4:0]Alu;
reg     [4:0]Alu;

always @(S) 
begin
  	case(S)
        4'b1101:   Alu = ~(A&B);
        4'b1100:   Alu = A ~^ B;
        4'b0111:   Alu = A >> 2;
        4'b0101:   Alu = {B[3:0], B[4]};
        4'b0001:   Alu = (A>B)? A:B;
        4'b0000:   Alu = (A>B)? 5'b11111:0;
        default:   Alu = 6;
    endcase
end
    
endmodule