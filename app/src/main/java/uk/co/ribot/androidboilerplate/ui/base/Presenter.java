package uk.co.ribot.androidboilerplate.ui.base;

/**
 * より詳細なインターフェイス によって extend され、Activity がそれを implement する
 * <V extends MvpView>
 *  →こいつが extend するのは、アタッチしたい MvpViewタイプのいずれか。
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
