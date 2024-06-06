module mux(A,B,S,Y);
  input A,B,S;
  output Y;
  
  assign Sn= ~S;
  and(ASn,A,Sn);
  and(BS,B,S);
  or(Y,ASn,BS);

endmodule