package hello.hellospring.domain;/*
 * @created 08/09/2020 - 5:11 오후
 * @project hello-spring
 * @author ryan
 */

public class Member {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
