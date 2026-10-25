package highlow;

public enum Rank {
    TWO("2") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
            // 位置ではなく順序関係を知りたいため、compareTO()を使用
            // return this.ordinal() > rank.ordinal();
        }
    },
    THREE("3") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    FOUR("4") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    FIVE("5") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    SIX("6") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    SEVEN("7") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    EIGHT("8") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    NINE("9") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    TEN("10") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    JACK("J") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    QUEEN("Q") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    KING("K") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    },
    ACE("A") {
        @Override
        public boolean isStrongerThan(Rank rank) {
            return this.compareTo(rank) > 0;
        }
    };

    private final String label;

    Rank(String label) {
        this.label = label;
    }

    public abstract boolean isStrongerThan(Rank rank);

    public String label() {
        return label;
    }
}
