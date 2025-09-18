package com.pae.pmup.model;

import jakarta.persistence.*;

@Entity
@Table(name = "follow_relationships",
       uniqueConstraints = @UniqueConstraint(columnNames = {"follower_id","following_id"}))
public class FollowRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // quem segue
    @ManyToOne(optional=false)
    @JoinColumn(name = "follower_id")
    private User follower;

    // quem é seguido
    @ManyToOne(optional=false)
    @JoinColumn(name = "following_id")
    private User following;

    public FollowRelationship() {}

    public FollowRelationship(User follower, User following) {
        this.follower = follower;
        this.following = following;
    }

    public Long getId() { return id; }
    public User getFollower() { return follower; }
    public User getFollowing() { return following; }

    public void setId(Long id) { this.id = id; }
    public void setFollower(User follower) { this.follower = follower; }
    public void setFollowing(User following) { this.following = following; }
}
