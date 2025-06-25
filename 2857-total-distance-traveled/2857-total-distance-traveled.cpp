class Solution {
public:
    int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while(mainTank > 0){
            if(mainTank >= 5 && additionalTank--){ 
                distance += 50;
                mainTank -= 4;
            }
            else return distance + mainTank * 10;
        }
        return 0;
    }
};