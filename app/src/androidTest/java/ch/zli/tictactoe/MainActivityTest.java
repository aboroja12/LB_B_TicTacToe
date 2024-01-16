package ch.zli.tictactoe;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.buttonImage1),
                        childAtPosition(
                                allOf(withId(R.id.btn1),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                13)),
                                0),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.buttonImage4),
                        childAtPosition(
                                allOf(withId(R.id.btn4),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction appCompatImageView3 = onView(
                allOf(withId(R.id.buttonImage5),
                        childAtPosition(
                                allOf(withId(R.id.btn5),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView3.perform(click());

        ViewInteraction appCompatImageView4 = onView(
                allOf(withId(R.id.buttonImage8),
                        childAtPosition(
                                allOf(withId(R.id.btn8),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                9)),
                                0),
                        isDisplayed()));
        appCompatImageView4.perform(click());

        ViewInteraction appCompatImageView5 = onView(
                allOf(withId(R.id.buttonImage9),
                        childAtPosition(
                                allOf(withId(R.id.btn9),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                11)),
                                0),
                        isDisplayed()));
        appCompatImageView5.perform(click());

        ViewInteraction materialButton = onView(
                allOf(withId(android.R.id.button1), withText("Ok"),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                3)));
        materialButton.perform(scrollTo(), click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.scoreboard), withText("View the Scoreboard"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.backToGame), withText("Back to the Game"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.RelativeLayout")),
                                        0),
                                2),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction appCompatImageView6 = onView(
                allOf(withId(R.id.buttonImage7),
                        childAtPosition(
                                allOf(withId(R.id.btn7),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                10)),
                                0),
                        isDisplayed()));
        appCompatImageView6.perform(click());

        ViewInteraction appCompatImageView7 = onView(
                allOf(withId(R.id.buttonImage4),
                        childAtPosition(
                                allOf(withId(R.id.btn4),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatImageView7.perform(click());

        ViewInteraction appCompatImageView8 = onView(
                allOf(withId(R.id.buttonImage5),
                        childAtPosition(
                                allOf(withId(R.id.btn5),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatImageView8.perform(click());

        ViewInteraction appCompatImageView9 = onView(
                allOf(withId(R.id.buttonImage2),
                        childAtPosition(
                                allOf(withId(R.id.btn2),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                12)),
                                0),
                        isDisplayed()));
        appCompatImageView9.perform(click());

        ViewInteraction appCompatImageView10 = onView(
                allOf(withId(R.id.buttonImage3),
                        childAtPosition(
                                allOf(withId(R.id.btn3),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                14)),
                                0),
                        isDisplayed()));
        appCompatImageView10.perform(click());

        ViewInteraction materialButton4 = onView(
                allOf(withId(android.R.id.button1), withText("Ok"),
                        childAtPosition(
                                childAtPosition(
                                        withId(com.google.android.material.R.id.buttonPanel),
                                        0),
                                3)));
        materialButton4.perform(scrollTo(), click());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.scoreboard), withText("View the Scoreboard"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.backToGame), withText("Back to the Game"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.RelativeLayout")),
                                        0),
                                2),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.Reset), withText("Reset Game"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        materialButton7.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
