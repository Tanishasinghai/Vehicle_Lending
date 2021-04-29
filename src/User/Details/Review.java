/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Details;

/**
 *
 * @author tanis
 */
public class Review {
    private int ReviewId;
    private String name;
    private String review;
    private String email;

    public Review(int ReviewId, String name, String review, String email) {
        this.ReviewId = ReviewId;
        this.name = name;
        this.review = review;
        this.email = email;
    }

    public Review() {
    }

    public int getReviewId() {
        return ReviewId;
    }

    public void setReviewId(int ReviewId) {
        this.ReviewId = ReviewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
