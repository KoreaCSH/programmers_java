package Lv1;

public class 붕대감기 {

    public int solution(int[] bandage, int health, int[][] attacks) {

        int lastAttackTime = attacks[attacks.length-1][0];
        Bandage bandageClass = new Bandage(bandage[0], bandage[1], bandage[2]);
        Player player = new Player(bandageClass, health);
        int successTime = -1;
        int j = 0;

        for(int i = 0; i <= lastAttackTime; i++) {
            if(i == attacks[j][0]) {
                player.isAttacked(attacks[j][1]);
                if(player.isDead()) {
                    return -1;
                }
                successTime = 0;
                j++;
                continue;
            }
            successTime++;
            player.recover(successTime);
            if(successTime == bandageClass.getExecutionTime()) {
                successTime = 0;
            }
        }

        return player.getCurrentHealth();
    }

    static class Player {
        private int currentHealth;
        private int maxHealth;
        private Bandage bandage;

        Player(Bandage bandage, int maxHealth) {
            this.bandage = bandage;
            this.maxHealth = maxHealth;
            this.currentHealth = maxHealth;
        }

        public void recover(int successTime) {
            if(bandage.isValidAdditionalRecovery(successTime)) {
                currentHealth = Math.min(maxHealth, currentHealth + bandage.getAdditionalRecovery());
            }
            else {
                currentHealth = Math.min(maxHealth, currentHealth + bandage.getRecoveryAmountPerSecond());
            }
        }

        public void isAttacked(int damage) {
            currentHealth -= damage;
        }

        public boolean isDead() {
            return currentHealth <= 0;
        }

        public int getCurrentHealth() {
            return currentHealth;
        }

    }

    static class Bandage {
        private int executionTime;
        private int recoveryAmountPerSecond;
        private int additionalRecoveryAmount;

        Bandage(int executionTime, int recoveryAmountPerSecond, int additionalRecoveryAmount) {
            this.executionTime = executionTime;
            this.recoveryAmountPerSecond = recoveryAmountPerSecond;
            this.additionalRecoveryAmount = additionalRecoveryAmount;
        }

        public boolean isValidAdditionalRecovery(int successTime) {
            return executionTime == successTime;
        }

        public int getRecoveryAmountPerSecond() {
            return recoveryAmountPerSecond;
        }

        public int getAdditionalRecovery() {
            return recoveryAmountPerSecond + additionalRecoveryAmount;
        }

        public int getExecutionTime() {
            return executionTime;
        }

    }

}
