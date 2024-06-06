`timescale 1ns/1ns
module square_gate_tb();

reg     [1:0]In;
wire    [3:0]gO, dO, ifO, cO;

square_gate uut(
    .In(In),
    .gO(gO), 
    .dO(dO),
    .ifO(ifO), 
    .cO(cO)
);

initial
begin
    In[1] = 1'b0;
    In[0] = 1'b0;
    #100;
    In[1] = 1'b0;
    In[0] = 1'b1;
    #100;
    In[1] = 1'b1;
    In[0] = 1'b0;
    #100;
    In[1] = 1'b1;
    In[0] = 1'b1;
end

initial 
begin
    $display("Starting Testbench...");
    #500;
    $finish();
end

initial 
begin
    $dumpfile("dump.vcd");
    $dumpvars(0);
end

endmodule