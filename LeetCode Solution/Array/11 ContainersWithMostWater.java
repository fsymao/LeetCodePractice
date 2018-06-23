public  int maxArea(int[] height) {

    //maintain the indexes
    int indexLeft = 0;
    int indexRight = height.length - 1;

    //currentArea is something invalid right now!
    int currentArea = -1;

    while(indexLeft < indexRight){

        //lets calc the water container height, which will be min(heightX, heightY), if we think of it!
        int tempHeight = height[indexLeft] <= height[indexRight] ? height[indexLeft] : height[indexRight];

        //area = l * b;
        int tempArea = (indexRight - indexLeft) * tempHeight;

        //if this area is big, update
        currentArea = currentArea < tempArea ? tempArea : currentArea;


        //if the left height is smaller, than moving rightIndex closer to center will measure the same height
        //so, how about moving the leftIndex to center, so we have variant height
        if(height[indexLeft] < height[indexRight]){
            indexLeft++;
        }else if (height[indexLeft] > height[indexRight]) {
            indexRight--;
        }else {
            //this is equal case, but it doesn't matter
            indexLeft++;
        }

    }

    return currentArea;

}
