package highlow;

public enum Rank {
    TWO() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
            // 位置ではなく順序関係を知りたいため、compareTO()を使用
            // return this.ordinal() > rank.ordinal();
        }
    },
    THREE() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    FOUR() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    FIVE() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    SIX() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    SEVEN() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    EIGHT() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    NINE() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    TEN() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    JACK() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    QUEEN() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    KING() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    ACE() {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    };

    public abstract boolean isStrongerThan(Rank rank);

}