using UnityEngine;
using System.Collections;

public class LoadLevel : MonoBehaviour {




    public void GotoScene(int where)
    {
        Application.LoadLevel(where);
    }
}
