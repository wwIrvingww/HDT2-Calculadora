public interface IStack <T> {
    <T> void Pop ();
    void Push(T item);
    <T> T Peek ();
    int Size ();


}
