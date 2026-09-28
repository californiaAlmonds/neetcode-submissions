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
        if(this.getSize() == this.getCapacity()) 
            this.resize();
        this.data[this.getSize()] = n;
        this.size++;
    }

    public int popback() {
        int last = this.data[this.getSize()-1];
        this.data[this.getSize()-1] = 0;
        this.size--;
        return last;
    }

    private void resize() {
        int newData[] = new int[2*this.getCapacity()];
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
