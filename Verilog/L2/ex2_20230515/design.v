module test_gate (P,Q,R,S,T,U,V,W,X,Y,Z);

    input [4:0]P,Q;
    
    output [6:0]R;  //P*3
    output [3:0]S;  //Q*2
    output [5:0]T;  //學號個位數+P
    output [4:0]U;  //P Q 反及運算
    output [4:0]V;  //P 循環右移二位(連接運算子)
    output [5:0]W;  //P Q 結合成十位元向量資料的中間六個位元
    output [4:0]X;  //若P>10取P，若P<10取Q
    output Y;       //若Q 10~20 Y=1
    output Z;       //若P個位元中  '1'總數為奇數 Z=1

    assign R = P*3;            
    assign S = Q>>1;           
    assign T = 4'b0110 + P;    
    assign U = !(P&Q);
    assign V = {P[1:0],P[4:2]};
    assign W = {P[2:0],Q[4:2]};
    assign X = (P>10)?P:Q;     
    assign Y = (Q>=10&&Q<=20)?1:0; 
    assign Z =  ^P;            

endmodule