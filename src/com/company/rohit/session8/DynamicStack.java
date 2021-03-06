package com.company.rohit.session8;

public class DynamicStack extends CustomStack {
    @Override
    public void push(int item) {
        if(isfull()) {
            int[] temp = new int[this.data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            this.data = temp;
        }

        super.push(item);
    }
}
