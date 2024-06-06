`timescale 1ns/1ns
module shift_reg_for_tb ();

reg     Clk, D;
wire    [3:0]Q1;
    
shift_reg_for uut(
    .Clk(Clk),
    .D(D),
    .Q1(Q1)
);

initial 
begin
    Clk = 1'b0;
    D   = 1'b0;
    #110;       //110ns
    Clk = 1'b1;
    D   = 1'b1;
    #110;
    Clk = 1'b0;
    #110;       //330ns
    Clk = 1'b1;
    D   = 1'b0;
    #110;
    Clk = 1'b0;
    #110;       //550ns
    Clk = 1'b1;
    D   = 1'b1;
    #110;
    Clk = 1'b0;
    #110;       //770ns
    Clk = 1'b1;
    D   = 1'b0;
    #110;
    Clk = 1'b0;
    #110;       //990ns
    Clk = 1'b1;
    D   = 1'b1;
    #110;
    Clk = 1'b0;
    #110;
    Clk = 1'b1;
    #110;
    Clk = 1'b0;
    #110;       //1430ns
    Clk = 1'b1;
    D   = 1'b0;
    #110;
    Clk = 1'b0;
    #110;
    Clk = 1'b1;
    #110;
    Clk = 1'b0;
    #110;       //1870ns
    Clk = 1'b1;
    D   = 1'b1;
    #110;
    Clk = 1'b0;
    #110;
    Clk = 1'b1;
    #110;
    Clk = 1'b0;
    #110;       //2310ns
    Clk = 1'b1;
end

initial 
begin
    $display("Starting Testbench...");
    #2400;
    $finish();
end

initial
begin
    $dumpfile("dump.vcd");
    $dumpvars(0);
end

endmodule