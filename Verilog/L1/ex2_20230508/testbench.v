`timescale 1ns/1ns
module mux_tb();

  // Inputs
  reg A;
  reg B;
  reg S;

  // Outputs
  wire Y;

  // Instantiate the Unit Under Test (UUT)
  mux uut (
    .A(A),
    .B(B),
    .S(S),
    .Y(Y)
  );

  // Initialize Inputs
  initial begin
    A = 1'b0;
    B = 1'b0;
    S = 1'b0;
    #160;
    A = 1'b1;
    B = 1'b0;
    S = 1'b0;
    #80;
    A = 1'b1;
    B = 1'b0;
    S = 1'b1;
    #140;
    A = 1'b0;
    B = 1'b0;
    S = 1'b1;
    #160;
    A = 1'b0;
    B = 1'b1;
    S = 1'b1;

  end

  initial 
  begin
    $display("Starting Testbench...");
    #800;
    $finish();
  end

  initial 
  begin
    // Required to dump signals to EPWave
    $dumpfile("dump.vcd");
    $dumpvars(0);
  end
endmodule
