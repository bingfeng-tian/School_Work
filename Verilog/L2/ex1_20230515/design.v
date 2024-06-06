module test_gate (A,B,C,X,Y,Z);

    input [3:0]A;
    input [3:0]B;
    input [3:0]C;

    output [3:0]X;  //max
    output [3:0]Y;  //min
    output [3:0]Z;  //middle

    assign X = (A>=B)?((A>=C)?A:C):((B>=C)?B:C);
    assign Y = (A<=B)?((A<=C)?A:C):((B<=C)?B:C);
    assign Z = (A<=C&&A>=B || A>=C&&A<=B)?A:((C<=A&&C>=B || C>=A&&C<=B)?C:B);

endmodule