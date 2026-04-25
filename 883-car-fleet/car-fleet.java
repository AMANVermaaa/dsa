class Car{
    int position;
    double time;
    Car(int position, double time){
        this.position=position;
        this.time=time;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];

        for(int i=0;i<n;i++){
            double time = (double)(target-position[i])/speed[i];
            cars[i] = new Car(position[i],time);
        }

        Arrays.sort(cars, (a,b)->b.position-a.position);

        Deque<Double> stk = new ArrayDeque<>();

        for(Car car: cars){
            stk.push(car.time);

            while(stk.size()>1){
                double top = stk.pop();
                if(top>stk.peek()){
                    stk.push(top);
                    break;
                }
            }
        }
        return stk.size();
    }
}