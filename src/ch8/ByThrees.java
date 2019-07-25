package ch8;

class ByThrees implements Series {

    private int start, val, prev;

    ByThrees() {
        start = 0;
        val = 0;
        prev = -3;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -3;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x-3;

    }

    int getPrevious(){
        return prev;
    }
}
