`timescale 1ns/1ns
module test_gate_tb();

    reg [4:0]P,Q;
    
    wire [6:0]R;
    wire [3:0]S;
    wire [5:0]T;
    wire [4:0]U,V;
    wire [5:0]W;
    wire [4:0]X;
    wire Y;
    wire Z;

  test_gate uut(
    .P(P),
    .Q(Q),
    .R(R),
    .S(S),
    .T(T),
    .U(U),
    .V(V),
    .W(W),
    .X(X),
    .Y(Y),
    .Z(Z)
  );

  initial    
  begin
    P=5'b00000; //P=0
    Q=5'b00000; //Q=0
    #100;
    P=5'b01010; //P=0
    Q=5'b10101; //Q=0
    #100;
    P=5'b00011; //P=0
    Q=5'b11100; //Q=0
    #100;
    P=5'b11100; //P=0
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