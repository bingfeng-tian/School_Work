`timescale 1ns/1ns
module dec_7seg_tb();

reg     [3:0]D;
wire    [6:0]Q1,Q2;

dec_7seg uut(
    .D(D),
    .Q1(Q1),
    .Q2(Q2)
);

initial 
begin
    D = 0;
    #100;
    D = 1;
    #100;
    D = 2;
    #100;
    D = 3;
    #100;
    D = 4;
    #100;
    D = 5;
    #100;
    D = 6;
    #100;
    D = 7;
    #100;
    D = 8;
    #100;
    D = 9;
    #100;
    D = 10;
    #100;
    D = 11;
    #100;
    D = 12;
    #100;
    D = 13;
    #100;
    D = 14;
    #100;
    D = 15;
end

initial 
begin
    $display("Starting Testbench...");
    #1600;
    $finish();
end

initial 
begin
    $dumpfile("dump.vcd");
    $dumpvars(0);
end

endmodule