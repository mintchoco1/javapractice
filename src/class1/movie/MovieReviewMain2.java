package class1.movie;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "인셉션";
        review1.review = "인생은 무한 루프";

        MovieReview review2 = new MovieReview();
        review2.title = "어바웃 타임";
        review2.review = "인생 영화";

        MovieReview reviews[] = new MovieReview[] {review1, review2};

        for (MovieReview r : reviews) {
            System.out.println("영화 제몫: " + r.title + " 리뷰: " + r.review);
        }
    }
}
