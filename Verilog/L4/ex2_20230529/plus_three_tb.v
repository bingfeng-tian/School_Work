`timescale 1ns/1ns
module plus_three_gate_tb();

reg     [2:0]In;
wire    [2:0]dO, ifO, cO;

plus_three_gate uut(
    .In(In),
    .dO(dO),
    .ifO(ifO),
    .cO(cO)
);

initial
begin
    In[2] = 1'b0;
    In[1] = 1'b0;
    In[0] = 1'b0;
    #100;
    In[2] = 1'b0;
    In[1] = 1'b0;
    In[0] = 1'b1;
    #100;
    In[2] = 1'b0;
    In[1] = 1'b1;
    In[0] = 1'b0;
    #100;
    In[2] = 1'b0;
    In[1] = 1'b1;
    In[0] = 1'b1;
    #100;
    In[2] = 1'b1;
    In[1] = 1'b0;
    In[0] = 1'b0;
    #100;
    In[2] = 1'b1;
    In[1] = 1'b0;
    In[0] = 1'b1;
    #100;
    In[2] = 1'b1;
    In[1] = 1'b1;
    In[0] = 1'b0;
    #100;
    In[2] = 1'b1;
    In[1] = 1'b1;
    In[0] = 1'b1;        
end

initial 
begin
    $display("Starting Testbench...");
    #1000;
    $finish();
end

initial 
begin
    $dumpfile("dump.vcd");
    $dumpvars(0);
end

endmodule