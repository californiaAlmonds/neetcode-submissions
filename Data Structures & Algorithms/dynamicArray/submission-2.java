class DynamicArray {
    private int data[];
    private int size; 
    public DynamicArray(int capacity) {
            this.data = new int[capacity];
            this.size = 0;
    }

    public int get(int i) {
        return this.data[i];
    }

    public void set(int i, int n) {
        this.data[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.data.length) 
            resize();
        this.data[this.size] = n;
        this.size++;
    }

    public int popback() {
        int last = this.data[this.size-1];
        this.size--;
        return last;
    }

    private void resize() {
        int newData[] = new int[2*this.data.length];
        for(int i=0; i<size;i++)
            newData[i] = data[i];
        this.data = newData;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return this.data.length;
    }
}
