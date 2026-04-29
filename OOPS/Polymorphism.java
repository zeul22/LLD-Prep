class Animal {
    private int runSpeed;

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    Animal(){
        this.runSpeed=0;
    }
}

class Tiger extends Animal{

    @Override
    public void setRunSpeed(int runSpeed) { 
        super.setRunSpeed(runSpeed+50);
    }

    public void setRunSpeed(int runSpeed, boolean specialSituation) {
        if(specialSituation){
            super.setRunSpeed(runSpeed+100);
        }
    }
    
}

enum runBehaviour{
    WALK, RUN, JOG, SPRINT
}

class Human extends Animal{

    @Override
    public void setRunSpeed(int runSpeed) { 
        super.setRunSpeed(runSpeed+50);
    }

    public void setRunSpeed(int runSpeed, runBehaviour specialSituation) {
        switch (specialSituation) { // will this come under Strategy Pattern or something else,
            case WALK: // I believe this will come under strategy pattern considering the values are different!
                super.setRunSpeed(runSpeed+10);
                break;
            case RUN:
                super.setRunSpeed(runSpeed+25);
                break;
            case JOG:
                super.setRunSpeed(runSpeed+18);
                break;
            case SPRINT:
                super.setRunSpeed(runSpeed+40);
                break;
            default:
                break;
        }
    }
    
}

