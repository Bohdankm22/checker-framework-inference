package checkers.inference.model;

import java.util.Arrays;

public class InequalityConstraint extends Constraint implements BinaryConstraint {

    private final Slot first;
    private final Slot second;

    public InequalityConstraint(Slot first, Slot second) {
        super(Arrays.asList(first, second));
        this.first = first;
        this.second = second;
    }

    @Override
    public <S, T> T serialize(Serializer<S, T> serializer) {
        return serializer.serialize(this);
    }

    @Override
    public Slot getFirst() {
        return first;
    }

    @Override
    public Slot getSecond() {
        return second;
    }

    @Override
    public Constraint make(Slot first, Slot second) {
        return new InequalityConstraint(first, second);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result + ((first == null) ? 0 : first.hashCode());
        result = result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InequalityConstraint other = (InequalityConstraint) obj;
        if ((first.equals(other.first) && second.equals(other.second))
                || (first.equals(other.second) && (second.equals(other.first)))) {
            return true;
        } else {
            return false;
        }
    }
}
