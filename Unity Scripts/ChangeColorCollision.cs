using UnityEngine;
using System.Collections;

public class ChangeCollorCollision : MonoBehaviour {

	//use this for initialization
	void start()
	{

	}
	void update()
	{

	}
	void OnCollisionEnter(collision col)
	{
		Renderer r = this.GetComponent<Renderer>();
		r.material.SetColor("_Color", Color.red)
	}
	void OnCollisionExit(collision col)
	{
		Renderer r = this.GetComponent<Renderer>();
		r.material.SetColor("_Color", Color.white)
	}



}