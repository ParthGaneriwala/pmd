/* Generated By:JJTree: Do not edit this line. ASTCollectionDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCollectionDeclaration extends SimpleNode {
  public ASTCollectionDeclaration(int id) {
    super(id);
  }

  public ASTCollectionDeclaration(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f257b2e05a2695099c0e15ca5b4f4429 (do not edit this line) */