package supernotes.notes;

public interface NoteFactory {
    Note createNote(String noteContent, String tag, String parentPageId, String pageId);
}
