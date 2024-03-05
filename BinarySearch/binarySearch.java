class binarySearch {
    public int[] binaryArray;
    public int nElems;

    public binarySearch(int[] binaryArray, int nElems) {
        this.binaryArray = binaryArray;
        this.nElems = nElems;
    }

    public int search(int key) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (binaryArray[currentIndex] == key) {
                return currentIndex; // return if keyfound
            } else if (lowerBound > upperBound) {
                return -1; // return key not found
            } else {
                if (binaryArray[currentIndex] < key) {
                    lowerBound = currentIndex + 1; // Search in the upper half
                } else {
                    upperBound = currentIndex - 1; // Search in the lower half
                }
            }
        }
    }


}
