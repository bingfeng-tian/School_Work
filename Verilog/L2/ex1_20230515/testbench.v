`timescale 1ns/1ns
module test_gate_tb();

    reg [3:0]A;
    reg [3:0]B;
    reg [3:0]C;
    wire [3:0]X;
    wire [3:0]Y;
    wire [3:0]Z;

  test_gate uut(
    .A(A),
    .B(B),
    .C(C),
    .X(X),
    .Y(Y),
    .Z(Z)
  );

  initial    
  begin
    A=4'b0000; //A=0
    B=4'b0000; //B=0
    C=4'b0000; //C=0
    #100;
    A=4'b1111; //A=0
    B=4'b1010; //B=0
    C=4'b0000; //C=0
    #100;
    A=4'b1011; //A=0
    B=4'b1000; //B=0
    C=4'b0001; //C=0
    #100;
    A=4'b0101; //A=0
    C=4'b1010; //C=0
  end
    
  initial 
  begin
    $display("Starting Testbench...");
    #500;
    $finish();
  end

  initial 
  begin
    // Required to dump signals to EPWave
    $dumpfile("dump.vcd");
    $dumpvars(0);
  end
endmodule