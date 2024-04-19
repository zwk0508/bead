package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:54
 */

public class NodeVisitor<R, C> {
    public R visit(Node node, C c) {
        return node.accept(this,c);
    }

    public R visitRoot(RootNode node, C c) {
        return visitNode(node,c);
    }

    public R visitImports(ImportsNode node, C c) {
        return visitNode(node,c);
    }

    public R visitVar(VarNode node, C c) {
        return visitNode(node,c);
    }

    public R visitAssign(AssignNode node, C c) {
        return visitNode(node,c);
    }
    public R visitAttributeAssign(AttributeAssignNode node, C c) {
        return visitNode(node,c);
    }

    public R visitFunc(FuncNode node, C c) {
        return visitNode(node,c);
    }

    public R visitValue(ValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitArray(ArrayNode node, C c) {
        return visitNode(node,c);
    }

    public R visitMap(MapNode node, C c) {
        return visitNode(node,c);
    }

    public R visitAttribute(AttributeNode node, C c) {
        return visitNode(node,c);
    }

    public R visitAttributeValue(AttributeValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitId(IdNode node, C c) {
        return visitNode(node,c);
    }
    public R  visitBooleanLiteralValue(BooleanLiteralValueNode node, C c){
        return visitNode(node,c);
    }

    public R  visitIntegerLiteralValue(IntegerLiteralValueNode node,C c){
        return visitNode(node,c);
    }
    public R  visitFloatLiteralValue(FloatLiteralValueNode node,C c){
        return visitNode(node,c);
    }

    public R  visitStringLiteralValue(StringLiteralValueNode node,C c){
        return visitNode(node,c);
    }
    public R visitLogicValue(LogicValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitPriorityLogicValue(PriorityLogicValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitPriorityBaseLogicValue(PriorityBaseLogicValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitComparisonValue(ComparisonValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitComparisonExpression(ComparisonExpressionNode node, C c) {
        return visitNode(node,c);
    }

    public R visitCalcExpression(CalcExpressionNode node, C c) {
        return visitNode(node,c);
    }

    public R visitArithmeticValue(ArithmeticValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitPriorityArithmeticValue(PriorityArithmeticValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitPriorityBaseArithmeticValue(PriorityBaseArithmeticValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitIfValue(IfValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitFuncCall(FuncCallNode node, C c) {
        return visitNode(node,c);
    }

    public R visitAnonymousFunc(AnonymousFuncNode node, C c) {
        return visitNode(node,c);
    }

    public R visitAnonymousFuncCall(AnonymousFuncCallNode node, C c) {
        return visitNode(node,c);
    }

    public R visitLambda(LambdaNode node, C c) {
        return visitNode(node,c);
    }

    public R visitLambdaBody(LambdaBodyNode node, C c) {
        return visitNode(node,c);
    }

    public R visitStatement(StatementNode node, C c) {
        return visitNode(node,c);
    }

    public R visitBlockStatement(BlockStatementNode node, C c) {
        return visitNode(node,c);
    }

    public R visitDeferCall(DeferCallNode node, C c) {
        return visitNode(node,c);
    }

    public R visitIfStatement(IfStatementNode node, C c) {
        return visitNode(node,c);
    }

    public R visitForStatement(ForStatementNode node, C c) {
        return visitNode(node,c);
    }

    public R visitCollectionValue(CollectionValueNode node, C c) {
        return visitNode(node,c);
    }

    public R visitReturnStatement(ReturnStatementNode node, C c) {
        return visitNode(node,c);
    }
    
    public R visitNode(Node node,C c){
        return null;
    }
}
