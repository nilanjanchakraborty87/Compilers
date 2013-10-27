import java.util.ArrayList;

public class CubexFunHeader extends CubexNode implements HVisitor{
    CubexVName name;
    CubexTypeScheme scheme;
    public CubexFunHeader(CubexVName n, CubexTypeScheme s) {
        name = n;
        scheme = s;
    }

    public String toString() {
 		return String.format("fun %s %s ;", name, scheme.toString());   	
    }

    public boolean equals(CubexFunHeader f) {
        return (name.equals(f.name)) && (scheme.equals(f.scheme));
    }

    public HNode visit(CubexNode c) {
        return null;
    }
}

class CubexFunction extends CubexFunHeader{
    CubexStatement body;

    public CubexFunction(CubexVName n, CubexTypeScheme s, CubexStatement b) {
        super(n, s);
        body = b;
    }

    // constructor for immediate return
    public CubexFunction(CubexVName n, CubexTypeScheme s, CubexExpression e) {
        super(n, s);
        body = new CubexReturn(e);
    }
    public String toString() {
    	String n = name.toString();
    	String s = scheme.toString();
    	String b = body.toString();
    	return String.format("fun %s %s %s", n, s, b);
    }

    public HNode visit(CubexNode c) {
        return null;
    }
}