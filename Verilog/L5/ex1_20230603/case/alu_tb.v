`timescale 1ns/1ns
module alu_tb ();

reg     [4:0]A, B;
reg     [3:0]S;
wire    [4:0]Alu;

Al_unit uut(
    .A(A),
    .B(B),
    .S(S),
    .Alu(Alu)
);

initial
begin
    A = 5'b10101;
    B = 5'b01100;
    S = 4'b1101;
  	#100;
    S = 4'b1100;
  	#100;
    S = 4'b0111;  	
    #100;
    S = 4'b0101;  	
    #100;
    S = 4'b0001;
  	#100;
    S = 4'b0000;
  	#100;
    S = 4'b1110;
end

initial 
begin
    $display("Starting Testbench...");
    #750;
    $finish();
end

initial 
begin
    $dumpfile("dump.vcd");
    $dumpvars(0);
end

endmodule