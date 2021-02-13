public class CabinCrewMember {
    private String name;
    private CabinCrewMemberRank rank;

    public CabinCrewMember(String name, CabinCrewMemberRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CabinCrewMemberRank getRank() {
        return rank;
    }

    public void setRank(CabinCrewMemberRank rank) {
        this.rank = rank;
    }
}
