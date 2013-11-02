package checkers.inference;

import checkers.basetype.BaseTypeChecker;
import checkers.inference.quals.VarAnnot;
import checkers.quals.TypeQualifiers;
import checkers.quals.Unqualified;

@TypeQualifiers({Unqualified.class, VarAnnot.class})
public class TestChecker extends BaseTypeChecker {

    @Override
    public void initChecker() {
        super.initChecker();
        System.out.println("Here!");
    }
}