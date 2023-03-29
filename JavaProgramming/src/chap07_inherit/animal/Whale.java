package chap07_inherit.animal;

public class Whale extends Animal {
    // 속성
    private String food;
    private String habitat;
    private int teeth;
    private int offspring;

    // 생성자
    public Whale(int age, int size, int legCnt, boolean hasWing, 
    		String food, String habitat, int teeth, int offspring) {
    	super(age, size, legCnt, hasWing);
        this.food = food;
        this.habitat = habitat;
        this.teeth = teeth;
        this.offspring = offspring;
    }

    // 기능
    public void eat() {
        System.out.println("먹는다.");
    }

    public void sprayWater() {
        System.out.println("물을 뿜는다.");
    }

    public void swimTogether() {
        System.out.println("무리지어 다닌다.");
    }

    // 게터 메소드
    public String getFood() {
        return food;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getTeeth() {
        return teeth;
    }

    public int getOffspring() {
        return offspring;
    }
}

