package hello.hellospring.repository;/*
 * @created 10/09/2020 - 2:49 오후
 * @project hello-spring
 * @author ryan
 */

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
