package hello.hellospring.repository;/*
 * @created 08/09/2020 - 5:12 오후
 * @project hello-spring
 * @author ryan
 */

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
