import java.util.ArrayList;
import java.util.List;

public class MemberRegistry<T extends Member> {

    private List<T> members;

    public MemberRegistry() {
        members = new ArrayList<>();
    }

    public void addMember(T member) {
        members.add(member);
    }

    public void displayMembers() {
        for (T member : members) {
            member.displayDetails();
        }
    }

    public T findMember(String memberId) {
        for (T member : members) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    public int getMemberCount() {
        return members.size();
    }

    public List<T> getMembers() {
        return new ArrayList<>(members);
    }
}
