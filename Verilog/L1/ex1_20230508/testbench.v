`timescale 1ns/1ns
module full_add1_tb;

  // Inputs
  reg A;
  reg B;
  reg Ci;

  // Outputs
  wire Co;
  wire S;

  // Instantiate the Unit Under Test (UUT)
  full_add1 uut (
    .A(A),
    .B(B),
    .Ci(Ci),
    .Co(Co),
    .S(S)
  );

  // Initialize Inputs
  initial begin
    A = 1'b0;
    B = 1'b0;
    Ci = 1'b0;
    #100;
    A = 1'b0;
    B = 1'b0;
    Ci = 1'b1;
    #100;
    A = 1'b0;
    B = 1'b1;
    Ci = 1'b0;
    #100;
    A = 1'b0;
    B = 1'b1;
    Ci = 1'b1;
    #100;
    A = 1'b1;
    B = 1'b0;
    Ci = 1'b0;
    #100;
    A = 1'b1;
    B = 1'b0;
    Ci = 1'b1;
    #100;
    A = 1'b1;
    B = 1'b1;
    Ci = 1'b0;
    #100;
    A = 1'b1;
    B = 1'b1;
    Ci = 1'b1;
  end

  initial 
  begin
    $display("Starting Testbench...");
    #1000;
    $finish();
  end

  initial 
  begin
    // Required to dump signals to EPWave
    $dumpfile("dump.vcd");
    $dumpvars(0);
  end
endmodule
