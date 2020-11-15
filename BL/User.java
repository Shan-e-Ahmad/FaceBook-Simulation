package Test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class User {

        private Long id;
        private String password;
        private String googleId;


        private List<Posts> posts;
        private Set<User> friends;
        private Set<User> incomingFriendRequests;

        private Set<User> outgoingFriendRequests;
        private Set<Posts> likedPosts;

        public User() {

        }

        public User() {

            this.posts = new ArrayList<>();
            this.friends = new HashSet<>();
            this.incomingFriendRequests = new HashSet<>();
        }

        public Long getId() {
            return id;
        }

        @Override
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }



        public List<Posts> getPosts() {
            return posts;
        }

        public void setPosts(List<Posts> posts) {
            this.posts = posts;
        }

        public void addFriend(User newFriend) {
            this.getFriends().add(newFriend);
            newFriend.getFriends().add(this);
        }

        public void removeFriend(User friendNoMore) {
            this.getFriends().remove(friendNoMore);
            friendNoMore.getFriends().remove(this);
        }

        public Set<User> getIncomingFriendRequests() {
            return incomingFriendRequests;
        }

        public void setIncomingFriendRequests(Set<User> incomingFriendRequests) {
            this.incomingFriendRequests = incomingFriendRequests;
        }

        public Set<User> getOutgoingFriendRequests() {
            return outgoingFriendRequests;
        }

        public Set<User> getFriends() {
            return friends;
        }

        public void setFriends(Set<User> friends) {
            this.friends = friends;
        }




        public void setLikedPosts(Set<Posts> likedPosts) {
            this.likedPosts = likedPosts;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            User user = (User) o;

            return id.equals(user.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }



        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }