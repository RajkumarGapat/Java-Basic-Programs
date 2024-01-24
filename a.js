class PowerOfTwoMaxHeap {
    constructor(arity) {
        if (arity <= 0 || (arity & (arity - 1)) !== 0) {
            throw new Error("Arity must be a positive power of two.");
        }
        this.heap = [];
        this.arity = arity;
    }

    insert(value) {
        this.heap.push(value);
        this.heapifyUp(this.heap.length - 1);
    }

    popMax() {
        if (this.heap.length === 0) {
            throw new Error("Heap is empty.");
        }

        const max = this.heap[0];
        const lastIdx = this.heap.length - 1;
        this.heap[0] = this.heap[lastIdx];
        this.heap.pop();

        this.heapifyDown(0);

        return max;
    }

    heapifyUp(index) {
        while (index > 0) {
            const parent = Math.floor((index - 1) / this.arity);
            if (this.heap[index] > this.heap[parent]) {
                this.swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    heapifyDown(index) {
        let maxIndex = index;
        for (let i = 1; i <= this.arity; i++) {
            const child = this.arity * index + i;
            if (child < this.heap.length && this.heap[child] > this.heap[maxIndex]) {
                maxIndex = child;
            }
        }

        if (maxIndex !== index) {
            this.swap(index, maxIndex);
            this.heapifyDown(maxIndex);
        }
    }

    swap(i, j) {
        const temp = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = temp;
    }
}

// Example usage
const heap = new PowerOfTwoMaxHeap(2);

heap.insert(10);
heap.insert(5);
heap.insert(20);

console.log(heap.popMax()); // Output: 20
console.log(heap.popMax()); // Output: 10
