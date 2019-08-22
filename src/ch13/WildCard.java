package ch13;

class WGen<T extends Number> {
    private T object;

    WGen(T object) {
        this.object = object;
    }

    void absEqual(WGen<?> ob) {
        if (Math.abs(object.doubleValue()) == Math.abs(ob.object.doubleValue()))
            System.out.println("Absolute values are same");
        else System.out.println("Absolute values are different");
    }
}

class WildcardDemo {
    public static void main(String[] args) {

        WGen<Integer> integerObj = new WGen<>(17);
        WGen<Double> doubleObj = new WGen<>(-17.0);
        WGen<Float> floatObj = new WGen<>(16.3F);

        integerObj.absEqual(doubleObj);
        integerObj.absEqual(floatObj);
    }
}