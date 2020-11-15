package Test2;

public class Comment {



        private Long id;

        private Post post;

        private User user;

        private String content;

        public Comment(Post post, User user, String content) {
            this.post = post;
            this.user = user;
            this.content = content;
        }

        public Comment() {
        }

        public Long getId() {
            return id;
        }

        public Posts getPost() {
            return post;
        }

        public void setPost(Posts post) {
            this.post = post;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content.trim();
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Comment comment = (Comment) o;

            return id != null ? id.equals(comment.id) : comment.id == null;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Comment{" +
                    "id=" + id +
                    ", user=" + user +
                    ", content='" + content + '\'' +
                    '}';
        }
    }