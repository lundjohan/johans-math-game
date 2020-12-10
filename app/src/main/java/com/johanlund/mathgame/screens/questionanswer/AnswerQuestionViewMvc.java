package com.johanlund.mathgame.screens.questionanswer;

import com.johanlund.mathgame.common.models.QuestionModel;
import com.johanlund.mathgame.common.ViewMvc;

public interface AnswerQuestionViewMvc extends ViewMvc {
    void bindQuestionToView(QuestionModel qm);

    void doCorrectGraphics();

    void doIncorrectGraphics();

    QuestionModel retrieveQuestionFromView();

    Integer retrieveAnswer();

    void setListener(AnswerQuestionViewMvc.Listener l);

    void unregisterListener();


    interface Listener extends ViewMvc.Listener {
        public void checkAnswer();
    }
}
