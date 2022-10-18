import cv2
def cv_show(name ,image):
    cv2.imshow(name,image)
    key = cv2.waitKey(0)
    if key & 0xFF ==ord('q'):
        cv2.destroyAllWindows()