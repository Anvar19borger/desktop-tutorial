package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate()); // date field
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); // photoId field
    };

    //fields
    private Photo[] photos;
    private int size;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        // ischem index kuda vstavit
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        // obrabotka indexa
        index = index >= 0 ? index : -index - 1;
        // rasdvigaem massiv  s indexa na 1 mesto v pravo
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }


    @Override
    public boolean removePhoto(int photoId, int albumId) {
        // ischem foto
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                // nadvigaem  masiv na naidenuju posiciju i udoljaem foto
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);
                // size --;
                photos[--size] = null;
                return true;

            }

        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId,albumId);// naschli foto
        if (photo == null){
            return false;

        }

        photo.setUrl(url);// naschli foto  obnavili url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId,photoId,null,null,null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])){
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate(p -> albumId == p.getAlbumId());
    }
    private Photo[]findByPredicate(Predicate<Photo> predicate){
        Photo[] res = new Photo[size];
        int j = 0;// schotchik naideenich foto v albome
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])){
                res[j] = photos[i];
                j++;

            }

        }
        // sapolnili massiv no v nem posle index j idut null
        return Arrays.copyOf(res, j);// vernuli obresanii mmasiv bes elimentov null
    }


    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {



        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }

}
