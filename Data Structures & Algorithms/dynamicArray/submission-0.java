class DynamicArray {

    int capacity;
    Integer[] array;
    int size;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }

        this.array = new Integer[capacity];
        this.size = 0;
    }

    public int get(int i) {
        System.out.println(i);
        System.out.println(this.array.length);
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.capacity) {
            this.resize();
        } 
        this.array[size] = n;
        size++;
    }

    public int popback() {
        int last = this.array[size-1];
        size -= 1;
        return last;
    }

    private void resize() {
        this.capacity = 2*this.capacity;
        Integer[] exactCopy = Arrays.copyOf(this.array, this.capacity);
        this.array = exactCopy;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
